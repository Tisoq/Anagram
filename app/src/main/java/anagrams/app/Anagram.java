package anagrams.app;

class Anagram {

    static String build(String input, String filter) {

        StringBuilder result = new StringBuilder();

        String[] words = input.split("\\s");

        for (String word : words) {

            char[] wordCharArray = word.toCharArray();
            int leftPointer = 0;
            int rightPointer = wordCharArray.length - 1;

            while (leftPointer < rightPointer) {

                if (filter.indexOf(wordCharArray[leftPointer]) > -1) {
                    leftPointer += 1;
                    continue;
                }
                if (filter.indexOf(wordCharArray[rightPointer]) > -1) {
                    rightPointer -= 1;
                    continue;
                }

                char tmp = wordCharArray[leftPointer];
                wordCharArray[leftPointer] = wordCharArray[rightPointer];
                wordCharArray[rightPointer] = tmp;
                leftPointer += 1;
                rightPointer -= 1;
            }
            result.append(String.copyValueOf(wordCharArray)).append(" ");
        }
        return result.toString();
    }
}
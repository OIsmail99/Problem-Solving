class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listOfLists = new ArrayList<>(numRows);

        for (int row = 1; row <= numRows; row++) {
            if (row == 1) { // first array
                List<Integer> list = new ArrayList<>(row);
                list.add(1);
                listOfLists.add(list);
                continue;
            }
            if (row == 2) { // second array
                List<Integer> list = new ArrayList<>(row);
                list.add(1);
                list.add(1);
                listOfLists.add(list);
                continue;
            }

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < row; i++) {
                list.add(i, 1); // prefilling
            }

            for (int i = 1; i < list.size() - 1; i++) {
                int start = listOfLists.get(listOfLists.size() - 1).get(i);
                int end = listOfLists.get(listOfLists.size() - 1).get(i - 1);
                list.set(i, start + end);
            }
            listOfLists.add(list);

        }
        return listOfLists;
    }
}
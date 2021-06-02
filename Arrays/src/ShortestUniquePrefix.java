import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class ShortestUniquePrefix {

    public static void main(String[] args) {

        ShortestUniquePrefix obj = new ShortestUniquePrefix();

        ArrayList<String> list = new ArrayList<>(Arrays.asList( "zebra", "dog", "duck", "dot" ));
        obj.prefix(list);
    }

    public ArrayList<String> prefix(ArrayList<String> A) {

        HashMap<Character, Node> letterNodeMap = new HashMap<>();
        ArrayList<String> returnList = new ArrayList<>();

        for (String word : A) {

            char curr = word.charAt(0);
            Node currNode;
            if(letterNodeMap.containsKey(curr)){

                currNode = letterNodeMap.get(curr);
                currNode.addFreq();
            }
            else {

                currNode = new Node(curr);
                letterNodeMap.put(curr, currNode);
            }

            for (int i = 1; i < word.length(); i++) {

                curr = word.charAt(i);

                if(currNode.nextLetterNodeMap.containsKey(curr)) {

                    currNode = currNode.nextLetterNodeMap.get(curr);
                    currNode.addFreq();
                }
                else {

                    Node nextNode = new Node(curr);
                    currNode.nextLetterNodeMap.put(curr, nextNode);

                    currNode = nextNode;
                }
            }
        }

        for(String word : A) {

            Node currNode = letterNodeMap.get(word.charAt(0));
            StringBuilder buffer = new StringBuilder();

            if(currNode.freq == 1) {
                returnList.add("" + currNode.value);
                continue;
            }

            buffer.append(currNode.value);
            int i;
            for (i = 1; i < word.length(); i++) {

                currNode = currNode.nextLetterNodeMap.get(word.charAt(i));
                buffer.append(currNode.value);

                if(currNode.freq == 1) {

                    returnList.add(buffer.toString());
                    break;
                }
            }
            if(i >= word.length()) {

                returnList.add(buffer.toString());
            }
        }

        return returnList;
    }

    public class Node {

        public char value;
        public int freq;

        public HashMap<Character, Node> nextLetterNodeMap = new HashMap<>();

        Node (char value) {

            this.value = value;
            freq = 1;
        }

        public void addFreq () {

            freq += 1;
        }
    }
}

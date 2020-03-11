package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * chapter2.Exercise16
 *
 * @author Quanyu Sha
 * @date 11/03/2020
 */
public class Exercise16 {

    /*Question:
    Implement a class Queue, an unbounded queue of strings. Provide methods add, adding at the
    tail, and remove, removing the head of the queue. Store elements as a linked of nodes. Make
    Node a nested class.

    Provide an iterator - an object that yields the elements of the queue in turn.
    Make Iterator a nested class with methods next and hasNext. Provide a method iterator() of the
    Queue class that yields a Queue.Iterator.
    */

    public class Queue {
        private List<Node> nodes = new ArrayList<Node>();
        ;
        // a pointer to indicate the start position
        private int pStart = 0;

        private class Node {
            private String nodeValue;

            private Node(String nodeValue) {
                this.nodeValue = nodeValue;
            }

            public String getNodeValue() {
                return nodeValue;
            }
        }

        private class Iterator {
            private int iteratorStart = 0;

            private boolean hasNext() {
                return ((nodes.size() - iteratorStart) >= pStart);
            }

            private Node next() {
                if (hasNext()) {
                    String message = "There is no next for iterator.";
                    throw new IllegalArgumentException(message);
                } else {
                    int currentIndex = nodes.size() - iteratorStart;
                    iteratorStart++;
                    return nodes.get(currentIndex);
                }
            }
        }

        public void enqueue(String nodeValue) {
            Node newNode = new Node(nodeValue);
            nodes.add(newNode);
        }

        public void dequeue() {
            if (isEmpty()) {
                String message = "The Queue is empty, you cannot dequeue.";
                throw new IllegalArgumentException(message);
            } else {
                pStart++;
            }
        }

        public Node getFrontNode() {
            return nodes.get(pStart);
        }

        public boolean isEmpty() {
            return pStart >= nodes.size();
        }
    }
}

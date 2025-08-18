

import java.util.LinkedList;
import java.util.Queue;

public class level {
     static class Node{
        int data ;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            left = null;
            right = null;

        }
    }
        static int idx=-1;
        public static Node buildTree(int[] node) {
            idx++;
            if(idx>=node.length||node[idx]==-1) return null;
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;

        }
    
        public static void level(Node root){
            Queue<Node> a = new LinkedList<>();
            a.add(root);
            a.add(null);
            while(!a.isEmpty()){
                Node cur = (Node) a.remove();
                if(cur == null){
                    System.out.println();
                    if(a.isEmpty()){
                        break;
                    }
                    else{
                        a.add(null);
                    }
                }
                else{
                    
                System.out.print(cur.data + " ");
                    if(cur.left != null){
                        a.add(cur.left);
                    }
                     if(cur.right != null){
                        a.add(cur.right);
                    }
                }

            }        
        }
        public static void main(String[] args) {
            int[] node = {1, 2, 4, -1, -1, 3, -1, -1, 5, -1, -1};
           level(buildTree(node));
        }
     }


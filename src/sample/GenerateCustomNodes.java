package sample;


import javafx.scene.paint.Color;

/**
 * This class generates randomized nodes
 *
 * @author Sajid_180041203
 *
 */
public class GenerateCustomNodes {
    public GenerateCustomNodes(){};

    public static Node[] GenerateCustomNodes(int len, int[] arr) {

        int m = 0;

        for(int i = 0; i < len; i++){
            m = Math.max(m,arr[i]);
        }

        Node nodes[] = new Node[len];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = new Node(arr[i]);
            nodes[i].setX(i * (SortingPageController.WINDOW_WIDTH / nodes.length));
            nodes[i].setFill(Color.LIGHTGRAY);
            setNodeDim(nodes[i], nodes.length, m);
            //System.out.println(nodes[i]);
        }
        return nodes;
    }

    public static void setNodeDim(Node nodes, int len, int m) {
        nodes.setWidth(SortingPageController.WINDOW_WIDTH / len - SortingPageController.X_GAP);
        nodes.setHeight((SortingPageController.WINDOW_HEIGHT / m) * nodes.getValue());
    }
}
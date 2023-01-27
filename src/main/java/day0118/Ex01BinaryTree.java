package day0118;

public class Ex01BinaryTree {
    static int[] array = {3, 7, 1, 2, 4, 0};
    static int currentIndex = 0;
    public static void main(String[] args) {
        Node zero = new Node();
        zero.value = array[currentIndex++];
        for (int i = 1; i < array.length; i++){
            insert(zero, array[i]);
        }

        System.out.println(zero.value); // 1차
        System.out.println(zero.left.value); // 2차
        System.out.println(zero.right.value);
        System.out.println(zero.left.left.value); // 3차
        System.out.println(zero.left.right.value);
        System.out.println(zero.right.left.value);

    }
    public static void insert(Node parent, int value){
        if (parent.value < value){
            if (parent.right == null){
                parent.right = createNode(value); // 오른쪽에 노드 생성
            } else {
                insert(parent.right, value); // 재귀함수 호출 오른쪽의 노드 값이 부모값으로 변경
            }
        } else {
            if (parent.left == null){
                parent.left = createNode(value); // 왼쪽에 노드 생성
            } else {
                insert(parent.left, value); // 재귀함수 호출 왼쪽의 노드 값이 부모 값으로 변경
            }
        }
    }

    public static Node createNode(int value){
        Node n = new Node();
        n.value = value;

        return n;
    }
}

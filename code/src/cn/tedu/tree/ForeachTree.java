package cn.tedu.tree;

public class ForeachTree {
    public static void main(String[] str) {
        int[] array = {12, 76, 35, 22, 16, 48, 90, 46, 9, 40};
        BinaryTree root = new BinaryTree(array[0]);   //创建二叉树
        for (int i = 1; i < array.length; i++) {
            root.insert(root, array[i]);       //向二叉树中插入数据
        }
        System.out.println("先根遍历：");
        preOrder(root);
        System.out.println("中根遍历：");
        inOrder(root);
        System.out.println("后根遍历：");
        postOrder(root);
    }

    public static void preOrder(BinaryTree root){  //先序遍历
        if(root!=null){
            System.out.print(root.data+"-");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void inOrder(BinaryTree root){     //中序遍历
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.data+"--");
            inOrder(root.right);
        }
    }

    public static void postOrder(BinaryTree root){    //后序遍历
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"---");
        }
    }

}

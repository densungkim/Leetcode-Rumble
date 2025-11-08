package kim.dencka.java.easy;

import kim.dencka.java.payloads.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        TreeNode tree = TreeNode.fromArray(3, 9, 20, null, null, 15, 7); // [3.0, 14.5, 11.0]
        System.out.println(averageOfLevels(tree));
    }

    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null) return result;

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (!q.isEmpty()) {
            int level = q.size();
            double sum = 0.0;

            for (int i = 0; i < level; i++) {
                TreeNode cur = q.poll();
                sum += cur.val;
                if (cur.left != null) q.add(cur.left);
                if (cur.right != null) q.add(cur.right);
            }

            result.add(sum / level);
        }

        return result;
    }
}

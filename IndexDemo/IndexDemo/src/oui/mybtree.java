package oui;

public class mybtree {
	private static final int M = 4;

	private static final class Node {
		private int m;
		private int[] children = new int[m];

		private Node(int m) {
			this.m = m;
		}
	}

	private Node root; // root of the B-tree
	private int height; // height of the B-tree
	private int n;

}

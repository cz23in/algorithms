package com.thealgorithms.searches;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UnionFind {

    public static UnionFindCoverage coverage = new UnionFindCoverage();

    private final int[] p;
    private final int[] r;

    public UnionFind(int n) {
        coverage.reached("constructor");
        p = new int[n];
        r = new int[n];

        for (int i = 0; i < n; i++) {
            coverage.reached("constructor.forloop");
            p[i] = i;
        }
    }

    public int find(int i) {
        coverage.reached("find");
        int parent = p[i];

        if (i == parent) {
            coverage.reached("find.if1");
            return i;
        }

        final int result = find(parent);
        p[i] = result;

        return result;
    }

    public void union(int x, int y) {
        coverage.reached("union");
        int r0 = find(x);
        int r1 = find(y);

        if (r1 == r0) {
            coverage.reached("union.if1");
            return;
        }

        if (r[r0] > r[r1]) {
            coverage.reached("union.if2");
            p[r1] = r0;
        } else if (r[r1] > r[r0]) {
            coverage.reached("union.if3");
            p[r0] = r1;
        } else {
            coverage.reached("union.if4");
            p[r1] = r0;
            r[r0]++;
        }
    }

    public int count() {
        coverage.reached("count");
        List<Integer> parents = new ArrayList<>();
        for (int i = 0; i < p.length; i++) {
            coverage.reached("count.forloop");
            if (!parents.contains(find(i))) {
                coverage.reached("count.forloop.if1");
                parents.add(find(i));
            }
        }
        return parents.size();
    }

    public String toString() {
        return "p " + Arrays.toString(p) + " r " + Arrays.toString(r) + "\n";
    }

    // Tests
    public static void main(String[] args) {
        UnionFind uf = new UnionFind(5);
        System.out.println("init /w 5 (should print 'p [0, 1, 2, 3, 4] r [0, 0, 0, 0, 0]'):");
        System.out.println(uf);

        uf.union(1, 2);
        System.out.println("union 1 2 (should print 'p [0, 1, 1, 3, 4] r [0, 1, 0, 0, 0]'):");
        System.out.println(uf);

        uf.union(3, 4);
        System.out.println("union 3 4 (should print 'p [0, 1, 1, 3, 3] r [0, 1, 0, 1, 0]'):");
        System.out.println(uf);

        uf.find(4);
        System.out.println("find 4 (should print 'p [0, 1, 1, 3, 3] r [0, 1, 0, 1, 0]'):");
        System.out.println(uf);

        System.out.println("count (should print '3'):");
        System.out.println(uf.count());
    }
}

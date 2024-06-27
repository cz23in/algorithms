package com.thealgorithms.searches;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UnionFindTest {

    @Test
    public void unionFindTest() {
        UnionFind.coverage.reset();
        UnionFind uf = new UnionFind(5);

        Assertions.assertEquals(
                uf.toString(),
                "p [0, 1, 2, 3, 4] r [0, 0, 0, 0, 0]\n"
        );
        
        uf.union(1, 2);
        Assertions.assertEquals(
                uf.toString(),
                "p [0, 1, 1, 3, 4] r [0, 1, 0, 0, 0]\n"
        );

        Assertions.assertEquals(uf.count(), 4);

        UnionFind.coverage.print();
    }
}

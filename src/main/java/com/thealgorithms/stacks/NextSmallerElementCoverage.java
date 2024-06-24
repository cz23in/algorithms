package com.thealgorithms.stacks;

import com.thealgorithms.coverageutils.CoverageMap;

public class NextSmallerElementCoverage extends CoverageMap {
    @Override
    public void addDefaultValues() {
        expectFunction("fnse");
        expectFunction("fnse.if1");
        expectFunction("fnse.forloop1");
        expectFunction("fnse.forloop1.whileloop");
        expectFunction("fnse.forloop1.if1");
        expectFunction("fnse.forloop1.if2");
    }
}

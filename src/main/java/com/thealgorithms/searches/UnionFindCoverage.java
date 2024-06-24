package com.thealgorithms.searches;

import com.thealgorithms.coverageutils.CoverageMap;

public class UnionFindCoverage extends CoverageMap {
    @Override
    public void addDefaultValues() {
        expectFunction("constructor");
        expectFunction("constructor.forloop");
        expectFunction("find");
        expectFunction("find.if1");
        expectFunction("union");
        expectFunction("union.if1");
        expectFunction("union.if2");
        expectFunction("union.if3");
        expectFunction("union.if4");
        expectFunction("count");
        expectFunction("count.forloop");
        expectFunction("count.forloop.if1");
    }
}

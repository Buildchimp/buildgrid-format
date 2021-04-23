package org.commonjava.build.grid.format;

import java.util.List;

public class BuildOrder
{
    private List<ProjectRef> buildorder;

    public BuildOrder( List<ProjectRef> buildorder )
    {
        this.buildorder = buildorder;
    }

    public List<ProjectRef> getBuildorder()
    {
        return buildorder;
    }
}

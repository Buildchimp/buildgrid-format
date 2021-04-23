package org.commonjava.build.grid.format;

import java.util.List;

public class BuildOrder
{
    private List<ProjectDependencies> buildorder;

    public BuildOrder( List<ProjectDependencies> buildorder )
    {
        this.buildorder = buildorder;
    }

    public List<ProjectDependencies> getBuildorder()
    {
        return buildorder;
    }
}

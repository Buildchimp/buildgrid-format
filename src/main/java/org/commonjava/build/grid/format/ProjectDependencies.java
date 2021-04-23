package org.commonjava.build.grid.format;

import java.io.File;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

public class ProjectDependencies
{
    private final String ga;

    private final String path;

    private final Set<ProjectRef> dependencies;

    public ProjectDependencies( Path basepath, File projectFile, String groupId, String artifactId )
    {
        this.dependencies = new HashSet<>();
        this.ga = ProjectRef.getGA( groupId, artifactId );
        this.path = ProjectRef.getProjectPath( basepath, projectFile );
    }

    public ProjectDependencies( String ga, String path, Set<ProjectRef> dependencies )
    {
        this.ga = ga;
        this.path = path;
        this.dependencies = dependencies;
    }

    public void addDependencyRef( ProjectRef projectRef )
    {
        dependencies.add( projectRef );
    }

    public String getGa()
    {
        return ga;
    }

    public String getPath()
    {
        return path;
    }

    public Set<ProjectRef> getDependencies()
    {
        return dependencies;
    }
}

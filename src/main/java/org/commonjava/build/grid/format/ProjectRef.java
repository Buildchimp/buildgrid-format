package org.commonjava.build.grid.format;

import java.io.File;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.Set;

import static org.commonjava.build.grid.format.RefUtils.getGA;
import static org.commonjava.build.grid.format.RefUtils.getProjectPath;

public class ProjectRef
{
    private final String ga;

    private final String path;

    private final Set<DependencyRef> dependencies;

    public ProjectRef( Path basepath, File projectFile, String groupId, String artifactId )
    {
        this.dependencies = new HashSet<>();
        this.ga = getGA( groupId, artifactId );
        this.path = getProjectPath( basepath, projectFile );
    }

    public ProjectRef( String ga, String path, Set<DependencyRef> dependencies )
    {
        this.ga = ga;
        this.path = path;
        this.dependencies = dependencies;
    }

    public void addDependencyRef( DependencyRef dependencyRef )
    {
        dependencies.add( dependencyRef );
    }

    public String getGa()
    {
        return ga;
    }

    public String getPath()
    {
        return path;
    }

    public Set<DependencyRef> getDependencies()
    {
        return dependencies;
    }
}

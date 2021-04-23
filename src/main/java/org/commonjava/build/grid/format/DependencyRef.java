package org.commonjava.build.grid.format;

import java.io.File;
import java.nio.file.Path;
import java.util.Objects;

import static org.commonjava.build.grid.format.RefUtils.getGA;
import static org.commonjava.build.grid.format.RefUtils.getProjectPath;

public class DependencyRef
{
    private final String ga;

    private final String path;

    public DependencyRef( Path basepath, File projectFile, String groupId, String artifactId )
    {
        this.ga = getGA( groupId, artifactId );
        this.path = getProjectPath( basepath, projectFile );
    }

    public String getGa()
    {
        return ga;
    }

    public String getPath()
    {
        return path;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o )
            return true;
        if ( o == null || getClass() != o.getClass() )
            return false;
        DependencyRef that = (DependencyRef) o;
        return getGa().equals( that.getGa() );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( getGa() );
    }
}

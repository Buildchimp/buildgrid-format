package org.commonjava.build.grid.format;

import java.io.File;
import java.nio.file.Path;
import java.util.Objects;

public class ProjectRef
{
    private final String ga;

    private final String path;

    public ProjectRef( Path basepath, File projectFile, String groupId, String artifactId )
    {
        this.ga = getGA( groupId, artifactId );
        this.path = getProjectPath( basepath, projectFile );
    }

    public static String getProjectPath( Path basepath, File projectFile )
    {
        Path p = basepath.relativize( projectFile.toPath() ).getParent();
        return "./" + ( p == null ? "" : p.toString() );
    }

    public static String getGA( String groupId, String artifactId )
    {
        return String.format( "%s:%s", groupId, artifactId );
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
        ProjectRef that = (ProjectRef) o;
        return getGa().equals( that.getGa() );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( getGa() );
    }
}

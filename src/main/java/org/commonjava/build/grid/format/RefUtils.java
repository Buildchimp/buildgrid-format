package org.commonjava.build.grid.format;

import java.io.File;
import java.nio.file.Path;

public final class RefUtils
{
    public static String getProjectPath( Path basepath, File projectFile )
    {
        Path p = basepath.relativize( projectFile.toPath() ).getParent();
        return "./" + ( p == null ? "" : p.toString() );
    }

    public static String getGA( String groupId, String artifactId )
    {
        return String.format( "%s:%s", groupId, artifactId );
    }

}

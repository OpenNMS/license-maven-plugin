package org.opennms.maven.plugins.license.header;

import org.opennms.maven.plugins.license.model.Copyright;

/**
 * Contract of a file header.
 *
 * A header has three sections like in this example :
 *
 * <pre>
 * Description
 * %--
 * Copyright (C) firstYear[ - lastYear] holder
 * %--
 * License
 * </pre>
 *
 * @author tchemit dev@tchemit.fr
 * @since 1.0
 */
public class FileHeader
{

    /**
     * Description of the project or module to add in header.
     */
    protected String description;

    /**
     * Copyright model.
     */
    protected Copyright copyright = new Copyright();

    /**
     * License used in the header.
     */
    protected String license;

    /**
     * @return the project name, or nay other common informations for all
     * files of a project (or module)
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * @return the copyright model.
     */
    public Copyright getCopyright()
    {
        return copyright;
    }

    /**
     * @return the license content (this is not the fully license content,
     * but just a per file license resume)
     */
    public String getLicense()
    {
        return license;
    }

    public void setCopyright( Copyright copyright )
    {
        this.copyright = copyright;
    }

    public void setDescription( String description )
    {
        this.description = description;
    }

    public void setLicense( String license )
    {
        this.license = license;
    }
}

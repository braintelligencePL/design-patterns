package com.ddlab.rnd.patterns;

import better.performence.model.Roles;

/**
 * @author Debadatta Mishra(PIKU)
 *
 */
public enum EmployeeType
{
    CEO("CEO")
            {
                @Override
                public Roles getRoles()
                {
                    return new CEORoles();
                }
            },

    CTO("CTO")
            {
                @Override
                public Roles getRoles() {

                    return new CTORoles();
                }
            },

    CFO("CFO")
            {
                @Override
                public Roles getRoles() {

                    return new CFORoles();
                }
            };

    private EmployeeType( String type )
    {
        this.type = type;
    }

    private String type;
    public abstract Roles getRoles();

    public String getType()
    {
        return type;
    }

    @Override
    public String toString()
    {
        return "TYPE CODE -> "+type;
    }
}
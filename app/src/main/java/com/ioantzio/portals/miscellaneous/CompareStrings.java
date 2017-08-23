package com.ioantzio.portals.miscellaneous;

public class CompareStrings
{
    /**
     * @param string1 String to be compared
     * @param string2 String to be compared
     * @return Returns true if the two parameters are equal. Otherwise returns false
     */
    public boolean compareStrings(String string1, String string2)
    {
        if (string1.equals(string2))
        {
            return true;
        } else
        {
            return false;
        }
    }

    /**
     * @param string1 String to be compared
     * @param string2 String to be compared
     * @return Returns true if the two parameters are equal(case-sensitive). Otherwise returns false
     */
    public boolean strictCompareStrings(String string1, String string2)
    {
        string1 = modifyString(string1);
        string2 = modifyString(string2);

        if (string1.equals(string2))
        {
            return true;
        } else
        {
            return false;
        }
    }

    private String modifyString(String s)
    {
        String result = s;
        result = result.toUpperCase();
        result = result.trim();

        return result;
    }
}

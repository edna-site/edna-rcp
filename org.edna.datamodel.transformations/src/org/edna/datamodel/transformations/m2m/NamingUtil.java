package org.edna.datamodel.transformations.m2m;

/**
 * String conversion rules for naming conventions.
 *
 * @author Karsten Thoms (karsten.thoms@itemis.de)
 */
public class NamingUtil {
    public static String normalize(String name) {
        if (name == null)
            return null;

        boolean camelcase = false;
        StringBuilder sb = new StringBuilder();
        for (char ch : name.toCharArray()) {
            if (Character.toString(ch).matches("[\\s_\\.]")) {
                camelcase = true;
            } else {
                if (camelcase) {
                    sb.append(Character.toString(ch).toUpperCase());
                    camelcase = false;
                } else {
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}

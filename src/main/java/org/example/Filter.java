package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Filter {
    private final String regexp;          
    private final String replacement;   

    public Filter(String regexp, String replacement) {      
        this.regexp = regexp;
        this.replacement = replacement;
    }

    public String filter(String address) {
        Pattern pattern = Pattern.compile(regexp);      
        Matcher matcher = pattern.matcher(address);     
        if (matcher.find() && matcher.group(1).endsWith(matcher.group(3))) {
            address = matcher.replaceFirst(replacement);
        }
        return address;
    }

}

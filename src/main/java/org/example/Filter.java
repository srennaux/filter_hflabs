package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Filter {
    private final String regexp;          // private означает, что мы не можем узнать содержимое regexp в других классах
    private final String replacement;   // final - не можем менять значение regex

    public Filter(String regexp, String replacement) {      // constructor выполняется ТОЛЬКО один раз
        this.regexp = regexp;
        this.replacement = replacement;
    }

    public String filter(String address) {
        Pattern pattern = Pattern.compile(regexp);      // pattern запоминает регулярное выражение для последующей работы с ним
        Matcher matcher = pattern.matcher(address);     // pattern объединяет регулярное выражение с адресом к которому мы хотим его применить
        if (matcher.find() /* true если регулярное выражение в адресе есть */ && /* и */ matcher.group(1).endsWith(matcher.group(3))) {
            address = matcher.replaceFirst(replacement);
        }
        return address;
    }

}
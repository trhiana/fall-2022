package com.practical;

/**
 * @author Rhiana Thelemaque
 */

import java.lang.Exception;
import java.lang.String;

public class NoFileProvidedException extends Exception {
    public NoFileProvidedException(String error){
        super(error);
    }
}

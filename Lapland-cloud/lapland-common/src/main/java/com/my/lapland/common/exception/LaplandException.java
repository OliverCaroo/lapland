package com.my.lapland.common.exception;

/**
 * FEBS系统异常
 *
 * @author MrBird
 */
public class LaplandException extends RuntimeException {

    private static final long serialVersionUID = -6916154462432027437L;

    public LaplandException(String message) {
        super(message);
    }
}

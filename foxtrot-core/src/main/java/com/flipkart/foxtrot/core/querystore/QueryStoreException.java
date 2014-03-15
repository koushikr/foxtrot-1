package com.flipkart.foxtrot.core.querystore;

/**
 * User: Santanu Sinha (santanu.sinha@flipkart.com)
 * Date: 12/03/14
 * Time: 9:18 PM
 */
public class QueryStoreException extends Exception {
    public QueryStoreException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public QueryStoreException(ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public static enum ErrorCode {
        QUERY_RUN_ERROR
    }

    private ErrorCode errorCode;
}
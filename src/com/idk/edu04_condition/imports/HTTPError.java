package com.idk.edu04_condition.imports;


public enum HTTPError {
    BAD_REQUEST(400), UNAUTHORIZED(401), PAYMENT_REQUIRED(402), FORBIDDEN(403), NOT_FOUND(404);

    private final int code;
    HTTPError(int code) { this.code = code; }
    public int getCode() { return code; }

    public static HTTPError fromCode(int code) {
        for (HTTPError e : values()) {
            if (e.code == code) return e;
        }
        return null;
    }
}
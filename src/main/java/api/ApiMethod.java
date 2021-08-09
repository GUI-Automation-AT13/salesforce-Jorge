package api;

/**
 * This enum defines possible SalesForce Methods.
 */
public enum ApiMethod {
    POST("POST"),
    DELETE("DELETE"),
    PATCH("PATCH");

    private String name;

    ApiMethod(final String newName) {
        this.name = newName;
    }

    /**
     * Gets the api method.
     *
     * @return the request method.
     */
    public String toName() {
        return name;
    }
}

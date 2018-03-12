package com.debbiche.actuator.actuator;

import javax.validation.constraints.Size;

class RequestDto {

    @Size(min = 3)
    private String message;

    String getMessage() {
        return message;
    }

    void setMessage(String message) {
        this.message = message;
    }
}

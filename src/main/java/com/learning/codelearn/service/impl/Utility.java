package com.learning.codelearn.service.impl;

import jakarta.servlet.http.HttpServletRequest;

public class Utility {

    private Utility() {
    }

    public static String getSiteURL(HttpServletRequest request) {
        String siteURL = request.getRequestURL().toString();
        return siteURL.replace(request.getServletPath(), "");
    }
}

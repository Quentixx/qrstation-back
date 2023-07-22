package qrstation.back.data;

import java.util.UUID;

/**
 * Represents a QR Code by a UUID associated with an url.
 */
public class QRCode {

    private final String uuid;
    private String redirectURL;

    public QRCode(String uuid, String redirectURL) {
        this.uuid = uuid;
        this.redirectURL = redirectURL;
    }

    public String getUuid() {
        return uuid;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    public void setRedirectUrl(String newRedirectURL) {
        redirectURL = newRedirectURL;
    }
}

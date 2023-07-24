package qrstation.back.data;

/**
 * Represents a request for a specific QRCode on the restful service.
 * @param redirectUrl the redirect URL that has been defined.
 */
public record QRCodeRequest(String redirectUrl) {}

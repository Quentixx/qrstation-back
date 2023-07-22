# qrstation-back
This is the QRStation micro-service back-end project. Built with Spring in Java.

⚠️ Note: This project is currently in the planning stage and specific features are still being defined.

## Features
- UUID Integration: Every QRCode is attached to a unique UUID.
- Redirection Link: Customize the redirection link associated with each QRCode.
- Spring Boot: Leverage the power of Spring Boot for scalability and robustness.

Usage
Once the server is up, you can create, retrieve, update, and delete QRCodes with their associated UUIDs and redirection links.

## API Endpoints
### Create QRCode:

- POST /qrcodes
- Body > raw > JSON: { "redirectionLink": "http://url-to-affiliate.com" }
- Response:
<code>{
    "uuid": "c493f95a-ecf0-451a-ab68-d60ab8da514a", // New generated UUID
    "redirectURL": "http://url-to-affiliate.com"
}</code>

### Retrieve all QRCodes:
- GET /qrcodes

### Retrieve QRCode by UUID:
- GET /qrcodes/{uuid}

### Update QRCode redirection link:
- PUT /qrcodes/{uuid}
- Body > raw > JSON: { "redirectionLink": "http://new-link.com" }
- Response:
<code>{
    "uuid": "{uuid}",
    "redirectURL": "http://new-link.com"
}</code>

### Delete QRCode by UUID:
- DELETE /qrcodes/{uuid}
- Response: <code>true if deleted, false otherwise.</code>

## Contributing
Contributions, issues, and feature requests are welcome! Feel free to check the issues page.

## License
Distributed under the MIT License. See LICENSE for more information.

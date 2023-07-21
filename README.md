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
Payload: { "redirectionLink": "http://example.com" }

### Retrieve all QRCodes:
- GET /qrcodes

### Retrieve QRCode by UUID:
- GET /qrcodes/{uuid}

### Update QRCode redirection link:
- PUT /qrcodes/{uuid}
- Payload: { "redirectionLink": "http://new-link.com" }

### Delete QRCode by UUID:
- DELETE /qrcodes/{uuid}

## Contributing
Contributions, issues, and feature requests are welcome! Feel free to check the issues page.

## License
Distributed under the MIT License. See LICENSE for more information.

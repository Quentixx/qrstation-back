package qrstation.back.repo;

import org.springframework.data.repository.CrudRepository;
import qrstation.back.data.QRCode;

/**
 * The QRCodeRepository interface is a Spring Data repository that provides
 * CRUD (Create, Read, Update, Delete) operations for the QRCode entity.
 * It extends the CrudRepository interface, which is a part of Spring Data,
 * and allows easy interaction with the underlying database.
 */
public interface QRCodeRepository extends CrudRepository<QRCode, String> {
}

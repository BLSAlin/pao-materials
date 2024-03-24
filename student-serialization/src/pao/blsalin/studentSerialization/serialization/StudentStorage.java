package pao.blsalin.studentSerialization.serialization;

import pao.blsalin.studentSerialization.domain.Student;
import pao.blsalin.studentSerialization.serialization.deserializer.StudentDeserializer;
import pao.blsalin.studentSerialization.serialization.serializer.StudentSerializer;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.List;

public final class StudentStorage {
    private final StudentSerializer serializer;
    private final StudentDeserializer deserializer;

    public StudentStorage(StudentSerializer serializer, StudentDeserializer deserializer) {
        this.serializer = serializer;
        this.deserializer = deserializer;
    }

    public List<Student> readAllStudents(InputStream inputStream) {
        // TODO 6: Cu ajutorul deserializatorului, cititi din sursa studentii
        return Collections.emptyList();
    }

    public void writeAllStudents(OutputStream outputStream, List<Student> students) {
        // TODO 5: Cu ajutorul serializatorului, scrieti in sursa studentii

    }
}

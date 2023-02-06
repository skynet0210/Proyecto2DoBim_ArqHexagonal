/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Application;

import Ports.DocumentServiceEntrada;
import Domain.Document;
import Ports.DocumentRepositorySalida;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mauro
 */
@Service
public class DocumentServiceImpl implements DocumentServiceEntrada {
    @Autowired
    private DocumentRepositorySalida documentRepository;
 
    @Override
    public void createDocument(Document documento)
    {
        documentRepository.createDocument(documento);
    }
 
    @Override
    public Document getDocument(String documentName)
    {
        return documentRepository.getDocument(documentName);
    }
 
    @Override
    public List<Document> listDocument()
    {
        return documentRepository.getAllDocument();
    }
}

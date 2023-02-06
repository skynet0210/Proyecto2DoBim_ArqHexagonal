/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapters;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import Domain.Document;
import Ports.DocumentServiceEntrada;
import Ports.DocumentRepositorySalida;

/**
 *
 * @author mauro
 */
@RestController
@RequestMapping("/document")
public class DocumentRestController implements DocumentRestUI{
    @Autowired
    private DocumentServiceEntrada documentService;
 
    @Override
    public void createDocument(Document documento)
    {
        documentService.createDocument(documento);
    }
 
    @Override
    public Document getDocument(String documentName)
    {
        return documentService.getDocument(documentName);
    }
 
    @Override
    public List<Document> listDocument()
    {
        return documentService.listDocument();
    }
}

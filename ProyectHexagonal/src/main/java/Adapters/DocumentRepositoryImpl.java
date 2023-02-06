/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapters;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import Ports.DocumentRepositorySalida;

import org.springframework.stereotype.Repository;

import Domain.Document;
import Ports.DocumentRepositorySalida;
/**
 *
 * @author mauro
 */
@Repository
public class DocumentRepositoryImpl implements DocumentRepositorySalida {
    private Map<String, Document> documentStore
        = new HashMap<String, Document>();
 
    @Override
    public void createDocument(Document documento)
    {
        documentStore.put(documento.getName(), documento);
    }
 
    @Override
    public Document getDocument(String documentName)
    {
        return documentStore.get(documentName);
    }
 
    @Override
    public List<Document> getAllDocument()
    {
        return documentStore.values().stream().collect(Collectors.toList());
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Adapters;

import java.util.List;
import Domain.Document;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 *
 * @author mauro
 */
public interface DocumentRestUI {
    @PostMapping
    void createDocument(@RequestBody Document documento);
 
    @GetMapping("/{name}")
    public Document getDocument(@PathVariable String name);
 
    @GetMapping
    public List<Document> listDocument();
}

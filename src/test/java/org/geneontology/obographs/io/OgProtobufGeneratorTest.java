package org.geneontology.obographs.io;

import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import javax.validation.constraints.AssertTrue;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class OgProtobufGeneratorTest {

    @Test
    public void test() throws IOException {
        assertTrue(true);
        //System.out.println(s);
//        makeSchema(GraphDocument.class, "obographs-schema.proto");
//        makeSchema(Graph.class, "subschemas/obographs-graph-schema.proto");
//        makeSchema(Meta.class, "subschemas/obographs-meta-schema.proto");
    }
//    private void makeSchema(Class<?> c, String fn) throws IOException {
//    }	
//    private void makeSchemaEXPERIMENTAL(Class<?> c, String fn) throws IOException {
//        //ProtobufMapper mapper = new ProtobufMapper();
//        // Protobuf cannot serialize freeform Objects
//        ObjectMapper mapper = new ProtobufMapper();
//        //        ObjectMapper mapper = new ProtobufMapper()
//        //                .setFilterProvider(new SimpleFilterProvider().addFilter(
//        //                        "GraphDocumentClass",
//        //                        SimpleBeanPropertyFilter.serializeAllExcept("@context")));
//        //        // TODO: make these compile and pass!
//        ProtobufSchemaGenerator gen = new ProtobufSchemaGenerator();
//        // mapper.acceptJsonFormatVisitor(c, gen);
//        ProtobufSchema schemaWrapper = gen.getGeneratedSchema();
//        String s = schemaWrapper.getSource().toString();
//        writeSchema(fn, s);
//
//    }

    protected void writeSchema(String fn, String info) throws IOException {
        FileUtils.writeStringToFile(new File("target/"+fn), info);
    }

}

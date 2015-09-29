//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.13 at 06:13:14 PM CDT 
//

package restful2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "" , propOrder = {
    "searchIndex"
})
@XmlRootElement(name = "SearchResultsMap")
public class SearchResultsMap {

    
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "" , propOrder = {
        "indexName" , "results" , "pages" , "correctedQuery" , "relevanceRank" , "asin"
    })
    public static class SearchIndex {

        @XmlElement(name = "ASIN" , required = true)
        protected List<String> asin;
        @XmlElement(name = "CorrectedQuery")
        protected CorrectedQuery correctedQuery;
        @XmlElement(name = "IndexName" , required = true)
        protected String indexName;
        @XmlElement(name = "Pages")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger pages;
        @XmlElement(name = "RelevanceRank" , required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger relevanceRank;
        @XmlElement(name = "Results")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger results;

        
        public List<String> getASIN() {
            if (this.asin == null) this.asin = new ArrayList<String>();
            return this.asin;
        }

        
        public CorrectedQuery getCorrectedQuery() {
            return this.correctedQuery;
        }

        
        public String getIndexName() {
            return this.indexName;
        }

        
        public BigInteger getPages() {
            return this.pages;
        }

        
        public BigInteger getRelevanceRank() {
            return this.relevanceRank;
        }

        
        public BigInteger getResults() {
            return this.results;
        }

        
        public void setCorrectedQuery(CorrectedQuery value) {
            this.correctedQuery = value;
        }

        
        public void setIndexName(String value) {
            this.indexName = value;
        }

        
        public void setPages(BigInteger value) {
            this.pages = value;
        }

        
        public void setRelevanceRank(BigInteger value) {
            this.relevanceRank = value;
        }

        
        public void setResults(BigInteger value) {
            this.results = value;
        }

    }

    @XmlElement(name = "SearchIndex" , required = true)
    protected List<SearchResultsMap.SearchIndex> searchIndex;

    
    public List<SearchResultsMap.SearchIndex> getSearchIndex() {
        if (this.searchIndex == null) this.searchIndex = new ArrayList<SearchResultsMap.SearchIndex>();
        return this.searchIndex;
    }

}

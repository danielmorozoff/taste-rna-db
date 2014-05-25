package nodes;

/**
 * Raw data sequence provided from sequencing run. Reported in FastQ format
 * http://en.wikipedia.org/wiki/FASTQ_format
 * 
 * @SEQ_ID
	GATTTGGGGTTCAAAGCAGTATCGATCAAATAGTAAATCCATTTGTTCAACTCACAGTTT
	+
	!''*((((***+))%%%++)(%%%%).1***-+*''))**55CCF>>>>>>CCCCCCC65
 * @author danielmorozoff
 *
 */

public class Sequence {
	//Provided properties
	private String seqID; //Line 1
	private String raw_sequence; //Line 2
	private String quality; //Line 4
	//Line 3 is omitted because it may only contains duplicate info of seqID
	
	//Properties for DB
	private String db_seqID;
	
}

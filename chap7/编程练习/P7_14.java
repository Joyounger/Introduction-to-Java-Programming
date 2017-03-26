// date:17.3.26
// author: linyang <linyang@xiaomi.com>
// 税款类Tax




public class P7_14 {
	public static void main(String[] args) {
    int[][] bracketsFor2001 = {
      {27050, 65550, 136750, 297350}, // Single filer
      {45200, 109250, 166500, 297350}, // married filing jointly
      {22600, 54625, 83250, 148675}, // married filing separately
      {36250, 93650, 151650, 297350} // head of household
    };
    double[] ratesFor2001 = {0.15, 0.275, 0.305, 0.355, 0.391};

    int[][] bracketsFor2002 = {
      {6000, 27950, 67700, 141250, 307050}, // Single filer
      {12000 , 46700, 112850, 171950, 307050}, // married filing jointly
      {6000, 23350, 56425, 85975, 153525}, // married filing separately
      {10000, 37450, 96700, 156600, 307050} // head of household
    };
    double[] ratesFor2002 = {0.1, 0.15, 0.27, 0.30, 0.35, 0.386};
    
    // 2001年
    for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) 
			System.out.print("\t" + taxableIncome + "");
		System.out.println();
    for (int filingStatus = 0; filingStatus < 4; filingStatus++) {
			if (filingStatus == 0) System.out.print("单身纳税人\t");
			if (filingStatus == 1) System.out.print("已婚共缴纳税人\t");
			if (filingStatus == 2) System.out.print("已婚单缴纳税人\t");
			if (filingStatus == 3) System.out.print("家庭缴纳税人\t");
			for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
				Tax t = new Tax(filingStatus, bracketsFor2001, ratesFor2001, taxableIncome);
				System.out.print(t.getTax() + "\t");
			}
			System.out.println();
		}
		
		// 2002
    for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) 
			System.out.print("\t" + taxableIncome + "");
		System.out.println();
    for (int filingStatus = 0; filingStatus < 4; filingStatus++) {
			if (filingStatus == 0) System.out.print("单身纳税人\t");
			if (filingStatus == 1) System.out.print("已婚共缴纳税人\t");
			if (filingStatus == 2) System.out.print("已婚单缴纳税人\t");
			if (filingStatus == 3) System.out.print("家庭缴纳税人\t");
			for (double taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 1000) {
				Tax t = new Tax(filingStatus, bracketsFor2002, ratesFor2002, taxableIncome);
				System.out.print(t.getTax() + "\t");
			}
			System.out.println();
		}
	}
}

class Tax {
	private int filingStatus; // 0-单身纳税人 1-已婚共缴纳税人 2-已婚单缴纳税人 3-家庭缴纳税人
	public final static int SINGLE_FILER = 0; 
	public final static int MARRIED_JINTLY = 1; 
	public final static int MARRIED_SEPARATELY = 2; 
	public final static int HEAD_OF_HOUSEHOLD = 3;
	
	private int[][] brackets = {
		{27050, 65550, 136750, 297350}, // Single filer
		{45200, 109250, 166500, 297350}, // married filing jointly
		{22600, 54625, 83250, 148675}, // married filing separately
		{36250, 93650, 151650, 297350} // head of household
	}; //每种纳税人的税率等级

	private double[] rates = { 0.15, 0.275, 0.305, 0.355, 0.391};		// 每种纳税等级的税率
	private double taxableIncome; // 可征税收入
	
	Tax() {
	}

	public Tax(int filingStatus, int[][] brackets, double[] rates,
		double taxableIncome) {
		this.filingStatus = filingStatus;
		this.brackets = brackets;
		this.rates = rates;
		this.taxableIncome = taxableIncome;
	}
 
	public void setBrackets(int[][] brackets) {
		this.brackets = brackets;
	}

	public void setRates(double[] rates) {
		this.rates = rates;
	}

	public void setFilingStatus(int filingStatus) {
		this.filingStatus = filingStatus;
	}
	
	public int getFilingStatus() {
		return filingStatus;
	}
	
	public double getTaxableIncome() {
		return taxableIncome;
	}

	public void setTaxableIncome(double taxableIncome) {
		this.taxableIncome = taxableIncome;
	}
	
	public double getTax() {
		double tax = 0;
		
		if (taxableIncome <= brackets[filingStatus][0]) {
			tax += taxableIncome * rates[0];
		} else {
			tax += brackets[filingStatus][0] * rates[0];
		}

		if ((taxableIncome > brackets[filingStatus][0]) && (taxableIncome <= brackets[filingStatus][3])) {
			for (int i = 1; i < brackets[filingStatus].length; i++) {
				if (taxableIncome - brackets[filingStatus][i] > 0) {
					tax += (brackets[filingStatus][i] - brackets[filingStatus][i-1]) * rates[i];
				} else {
					tax += (taxableIncome - brackets[filingStatus][i-1]) * rates[i];
					break;
				}
			}
		}
			
		if (taxableIncome > brackets[filingStatus][3]) {
			int i;
			for (i = 1; i < brackets[filingStatus].length; i++) {
				tax += (brackets[filingStatus][i] - brackets[filingStatus][i-1]) * rates[i];
			}
			tax += (taxableIncome - brackets[filingStatus][i-1]) * rates[i];
		}

		return tax;
	}
}



/*
	50000.0	51000.0	52000.0	53000.0	54000.0	55000.0	56000.0	57000.0	58000.0	59000.0	60000.0
单身纳税人	10368.75	10643.75	10918.75	11193.75	11468.75	11743.75	12018.75	12293.75	12568.75	12843.7513118.75	
已婚共缴纳税人	8100.0	8375.0	8650.0	8925.0	9200.0	9475.0	9750.0	10025.0	10300.0	10575.0	10850.0	
已婚单缴纳税人	10925.0	11200.0	11475.0	11750.0	12025.0	12311.25	12616.25	12921.25	13226.25	13531.25	13836.25	
家庭缴纳税人	9218.75	9493.75	9768.75	10043.75	10318.75	10593.75	10868.75	11143.75	11418.75	11693.75	11968.75	
	50000.0	51000.0	52000.0	53000.0	54000.0	55000.0	56000.0	57000.0	58000.0	59000.0	60000.0
单身纳税人	9846.0	10116.0	10386.0	10656.0	10926.0	11196.0	11466.0	11736.0	12006.0	12276.0	12546.0	
已婚共缴纳税人	7296.0	7566.0	7836.0	8106.0	8376.0	8646.0	8916.0	9186.0	9456.0	9726.0	9996.0	
已婚单缴纳税人	10398.0	10668.0	10938.0	11208.0	11478.0	11748.0	12018.0	12305.25	12605.25	12905.25	13205.25	
家庭缴纳税人	8506.0	8776.0	9046.0	9316.0	9586.0	9856.0	10126.0	10396.0	10666.0	10936.0	11206.0	


*/

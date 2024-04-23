package lib;

public class TaxFunction {
	
	private static final int BASE_NON_TAXABLE_INCOME = 54000000;
    private static final int MARRIED_NON_TAXABLE_INCOME_ADDITION = 4500000;
    private static final int CHILD_NON_TAXABLE_INCOME_ADDITION = 1500000;
    private static final int MAX_CHILD_COUNT_FOR_TAX_DEDUCTION = 3;

	
	/**
	 * Fungsi untuk menghitung jumlah pajak penghasilan pegawai yang harus dibayarkan setahun.
	 * 
	 * Pajak dihitung sebagai 5% dari penghasilan bersih tahunan (gaji dan pemasukan bulanan lainnya dikalikan jumlah bulan bekerja dikurangi pemotongan) dikurangi penghasilan tidak kena pajak.
	 * 
	 * Jika pegawai belum menikah dan belum punya anak maka penghasilan tidak kena pajaknya adalah Rp 54.000.000.
	 * Jika pegawai sudah menikah maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000.
	 * Jika pegawai sudah memiliki anak maka penghasilan tidak kena pajaknya ditambah sebesar Rp 4.500.000 per anak sampai anak ketiga.
	 * 
	 */
	
	
<<<<<<< Updated upstream
	public static int calculateTax(int monthlySalary, int otherMonthlyIncome, int numberOfMonthWorking, int deductible, boolean isMarried, int numberOfChildren) {
		
		int tax = 0;
		
		if (numberOfMonthWorking > 12) {
			System.err.println("More than 12 month working per year");
		}
		
		if (numberOfChildren > 3) {
			numberOfChildren = 3;
		}
		
		if (isMarried) {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - (54000000 + 4500000 + (numberOfChildren * 1500000))));
		}else {
			tax = (int) Math.round(0.05 * (((monthlySalary + otherMonthlyIncome) * numberOfMonthWorking) - deductible - 54000000));
		}
		
		if (tax < 0) {
			return 0;
		}else {
			return tax;
		}
			 
	}
=======
	 public static int calculateTax(TaxCalculationParams params) {
        int tax = 0;
        if (params.getNumberOfMonthWorking() > 12) {
            System.err.println("More than 12 month working per year");
        }

        int numberOfChildren = params.getNumberOfChildren();
        if (numberOfChildren > MAX_CHILD_COUNT_FOR_TAX_DEDUCTION) {
            numberOfChildren = MAX_CHILD_COUNT_FOR_TAX_DEDUCTION;
        }

        if (params.isMarried()) {
            tax = (int) Math.round(0.05 * (((params.getMonthlySalary() + params.getOtherMonthlyIncome()) * params.getNumberOfMonthWorking()) - params.getDeductible() - (BASE_NON_TAXABLE_INCOME + MARRIED_NON_TAXABLE_INCOME_ADDITION + (numberOfChildren * CHILD_NON_TAXABLE_INCOME_ADDITION))));
        } else {
            tax = (int) Math.round(0.05 * (((params.getMonthlySalary() + params.getOtherMonthlyIncome()) * params.getNumberOfMonthWorking()) - params.getDeductible() - BASE_NON_TAXABLE_INCOME));
        }

        if (tax < 0) {
            return 0;
        } else {
            return tax;
        }

    }
>>>>>>> Stashed changes
	
}

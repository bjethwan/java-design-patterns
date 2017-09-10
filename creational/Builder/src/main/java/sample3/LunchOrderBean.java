package sample3;

/**
 * 
 * This is Best.
 * This is immutable.
 * And build the object based on a config object.
 * Think how easy it will become if you are processing this
 * lunch orders from a CSV file compared to telescoping constructor.
 * 
 */
public class LunchOrderBean {

	public static class Builder{
		
		private String bread;
		private String condiments;
		private String dressing;
		private String meat;
		
		public Builder(){			
			// We can take some constructor arguments 
			// if some of params are MANDATORY or REQUIRED.
		}
		public LunchOrderBean build(){
			return new LunchOrderBean(this);
		}
		public Builder bread(String bread){
			this.bread = bread;
			return this;
		}
		public Builder condiments(String condiments){
			this.condiments = condiments;
			return this;
		}
		public Builder dressing(String dressing){
			this.dressing = dressing;
			return this;
		}
		public Builder meat(String meat){
			this.meat = meat;
			return this;
		}
	}

	private String bread;
	private String condiments;
	private String dressing;
	private String meat;
	
	public LunchOrderBean(Builder builder){
		this.bread = builder.bread;
		this.condiments = builder.condiments;
		this.dressing = builder.dressing;
		this.meat = builder.meat;
	}
	
	public String getBread() 		{ return bread; 	 }
	public String getCondiments() 	{ return condiments; }
	public String getDressing() 	{ return dressing; 	 }
	public String getMeat() 		{ return meat; 		 }

}

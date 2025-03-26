class Gin extends Decorator{
Gin(offering offer){
this.offering=offer;
}
@override
int getprice(){
return this.offering.getprice()+55;
}
String getname(){
return this.offering.getname()+ " gin";


}

}

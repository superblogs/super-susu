export class searchDto {
  q: string;
  from: number;
  size: number;
  sort: string;
  model: companyModel;

}
export class companyModel{
  name:string;
  city:string;
}

export class User {
  constructor(
    public ime: string,
    public prezime: string,
    public email: string,
    public password: string,
    public telefon: string,
    public address: string,
    public id?: string
  ) { }
}

export class User {
  constructor(
    public firstName: string,
    public lastName: string,
    public email: string,
    public password: string,
    public phoneNumber: string,
    public address: string,
    public id?: string
  ) { }
}

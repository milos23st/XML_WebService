export class Comment {
  constructor(
    public text: string,
    public approved: boolean,
    public name: string,
    public id?: string
  ) {}
}
